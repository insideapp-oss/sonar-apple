struct Application: App {
    var body: some Scene {
        WindowGroup {
            NavigationView {
                HomeView()
                    .navigationTitle("title")
                    .navigationBarTitleDisplayMode(.inline)
            }
            .navigationViewStyle(.stack)
        }
    }
}