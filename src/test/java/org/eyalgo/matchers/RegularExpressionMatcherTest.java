package org.eyalgo.matchers;

import static org.eyalgo.matchers.RegularExpressionMatcher.matchesPattern;
import static org.eyalgo.matchers.utils.MatchingUtils.assertDescription;
import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.hamcrest.*;
import org.junit.Test;

/**
 * Created by eyalgo on 3/7/14.
 */
public class RegularExpressionMatcherTest {

    @Test
    public void whenMatcherDoesNotMatch_usingString_ShouldFail() {
        String stringToEvaluate = "this is string";
        Matcher<String> stringMatcher = matchesPattern("this is string");
        boolean matches = stringMatcher.matches(stringToEvaluate);
        assertTrue("pattern did not match", matches);
    }

    @Test
    public void whenMatcherDoesNotMatch_usingPatter_ShouldFail() {
        String stringToEvaluate = "this is string";
        Pattern pattern = Pattern.compile(stringToEvaluate);
        Matcher<String> patternMatcher = matchesPattern(pattern);
        boolean matches = patternMatcher.matches(stringToEvaluate);
        assertTrue("pattern did not match", matches);
    }

    @Test
    public void verifyDescription() {
        Pattern pattern = Pattern.compile("");
        Matcher<String> patternMatcher = matchesPattern(pattern);
        assertDescription("Does not match", patternMatcher);

        Matcher<String> stringMatcher = matchesPattern("this is string");
        assertDescription("Does not match", stringMatcher);
    }
}
