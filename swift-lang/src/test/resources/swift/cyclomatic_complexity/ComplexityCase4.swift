func test() {
    if true {
        if true {
            if false {}
        }
    }

    if false {}

    let i = 0
    switch i {
        case 1: break
        case 2: break
        case 3: break
        case 4: break
        default: break
    }

    for _ in 1...5 {
        guard true else {
            return
        }
    }
}