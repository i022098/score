package org.score.samples.openstack.actions;

/**
 * Date: 7/29/2014.
 *
 * @author lesant
 */

public enum MatchType {
    CONTAINS,
    EXACT,
    NOT_EXACT,
    ALL_WORDS,
    AT_LEAST_ONE,
	DEFAULT,
    ONE,
    BEGINS_WITH,
    ENDS_WITH,
    ALWAYS_MATCH,
    EQUAL,
    NOT_EQUAL,
    COMPARE_GREATER,
    COMPARE_GREATER_OR_EQUAL,
    COMPARE_LESS,
    COMPARE_LESS_OR_EQUAL;
}
