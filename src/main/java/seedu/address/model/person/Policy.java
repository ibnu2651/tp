package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's policy in the address book.
 * Guarantees: immutable; is always valid
 */
public class Policy {
    public final String value;

    /**
     * Constructs a {@code Policy}.
     *
     * @param policy A valid policy.
     */
    public Policy(String policy) {
        requireNonNull(policy);
        value = policy;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Policy // instanceof handles nulls
                && value.equals(((Policy) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
