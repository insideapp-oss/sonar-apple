@implementation Test

- (NSInteger) test {
    if(YES) {
        int a;
        for( a = 10; a < 20; a = a + 1 ) { }
    }
    if(NO) {
        int a = 10;
        do {
            a = a + 1;
        } while( a < 20 );
    }

    int a = 10;
    while( a < 20 ) {
        a++;
    }
}

@end