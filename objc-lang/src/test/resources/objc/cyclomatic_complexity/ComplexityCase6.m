@implementation Test

- (void) test:(NSString*) value {

    NSString* a = value != nil ? @"true" : @"false"

    if([a isEqualToString:@"true"] && ![a isEqualToString:@"false"]) {
        NSLog(@"Success")
    }
}

@end