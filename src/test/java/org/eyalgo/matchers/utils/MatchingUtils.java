package org.eyalgo.matchers.utils;

import static org.junit.Assert.*;

import org.hamcrest.*;

/**
 * Created by eyalgo on 3/7/14.
 */
public class MatchingUtils {
    /**
     * This code is taken from hamcrest source code
     *
     * @{link https://github.com/hamcrest/JavaHamcrest/blob/master/hamcrest-core/src/test/java/org/hamcrest/AbstractMatcherTest.java}
     */
    public static void assertDescription(String expected, Matcher<?> matcher) {
        Description description = new StringDescription();
        description.appendDescriptionOf(matcher);
        assertEquals("Expected description", expected, description.toString().trim());
    }
}
