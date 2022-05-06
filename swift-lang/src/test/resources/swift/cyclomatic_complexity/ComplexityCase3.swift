//
//  ServiceProvider.swift
//  TurnipOff
//
//  Created by Gaël Foppolo on 13/04/2022.
//
import Foundation
import Combine
class ServiceProvider<T: Service> {
    private let urlSession: URLSession
    init(
        urlSession: URLSession
    ) {
        self.urlSession = urlSession
    }
}
extension ServiceProvider {
    func load<Value: Decodable>(_ service: T) -> AnyPublisher<Value, NetworkError> {
        guard let networkRequest = try? service.urlRequest() else {
            return .fail(NetworkError.invalidRequest)
        }
        return urlSession.dataTaskPublisher(for: networkRequest)
            .mapError { _ in NetworkError.invalidRequest }
            .flatMap { data, response -> AnyPublisher<Data, Error> in
                guard let response = response as? HTTPURLResponse else {
                    return .fail(NetworkError.unknownError)
                }
                guard 200..<300 ~= response.statusCode else {
                    return .fail(NetworkError.httpError(response.statusCode))
                }
                return .just(data)
            }
            .decode(type: Value.self, decoder: service.decoder)
            .mapError { error in
                return NetworkError.handleError(error)
            }
            .eraseToAnyPublisher()
    }
}