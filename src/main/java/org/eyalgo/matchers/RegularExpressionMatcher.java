package org.eyalgo.matchers;

import java.util.regex.Pattern;

import org.hamcrest.*;

/**
 * Created by eyalgo on 3/7/14.
 */
public class RegularExpressionMatcher extends CustomTypeSafeMatcher<String> {
    private final static String DESCRIPTION = "Does not match";
    private final Pattern pattern;

    private RegularExpressionMatcher(Pattern pattern) {
        super(DESCRIPTION);
        this.pattern = pattern;
    }

    private RegularExpressionMatcher(String pattern) {
        this(Pattern.compile(pattern));
    }

    @Override
    protected boolean matchesSafely(String item) {
        return pattern.matcher(item).matches();
    }

    @Factory
    public static Matcher<String> matchesPattern(Pattern pattern) {
        return new RegularExpressionMatcher(pattern);
    }

    @Factory
    public static Matcher<String> matchesPattern(String pattern) {
        return new RegularExpressionMatcher(pattern);
    }
}
