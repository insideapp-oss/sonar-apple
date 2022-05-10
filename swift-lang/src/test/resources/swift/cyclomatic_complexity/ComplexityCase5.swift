func test(sender: UIButton) {

    let menu: MenuType?

    switch sender.tag {
    case 1: menu = LeftGuestMenu(rawValue: 0)
    case 2: menu = LeftGuestMenu(rawValue: 1)
    case 3: menu = LeftGuestMenu(rawValue: 2)
    case 4: menu = LeftGuestMenu(rawValue: 3)
    case 5: menu = LeftGuestMenu(rawValue: 4)
    case 6: menu = LeftGuestMenu(rawValue: 5)
    default: menu = nil
    }

    if let menu = menu {
       self.changeGuestViewController(menu)
    }
}