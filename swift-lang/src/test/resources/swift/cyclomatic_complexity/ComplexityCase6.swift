func test(value: String?) {
    let a = value != nil ? "true" : "false"

    if a == "true", a != "false" {
        print("Success")
    }
}