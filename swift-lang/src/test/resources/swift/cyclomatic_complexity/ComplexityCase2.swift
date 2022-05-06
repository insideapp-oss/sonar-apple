//
//  PictureSizes.swift
//  TurnipOff
//
//  Created by Gaël Foppolo on 13/04/2022.
//
import Foundation
enum PictureSizes {
    case backdrop(Backdrop)
    case logo(Logo)
    case poster(Poster)
    case profile(Profile)
    enum Backdrop: String {
        case w300 = "w300"
        case w700 = "w780"
        case w1080 = "w1280"
        case original = "original"
    }
    enum Logo: String {
        case w45 = "w45"
        case w92 = "w92"
        case w154 = "w154"
        case w185 = "w185"
        case w300 = "w300"
        case w500 = "w500"
        case original = "original"
    }
    enum Poster: String {
        case w92 = "w92"
        case w154 = "w154"
        case w185 = "w185"
        case w342 = "w342"
        case w500 = "w500"
        case w780 = "w780"
        case original = "original"
    }
    enum Profile: String {
        case w92 = "w45"
        case w185 = "w185"
        case w632 = "h632"
        case original = "original"
    }
}
extension PictureSizes {
    private static let baseURL = "https://image.tmdb.org/t/p/"
    var value: String {
        switch self {
        case .backdrop(let backdrop):
            return backdrop.rawValue
        case .logo(let logo):
            return logo.rawValue
        case .poster(let poster):
            return poster.rawValue
        case .profile(let profile):
            return profile.rawValue
        }
    }
    func builURL(for path: String?) -> URL? {
        guard let path = path else { return nil }
        let urlString = Self.baseURL + self.value + path
        return URL(string: urlString)
    }
}