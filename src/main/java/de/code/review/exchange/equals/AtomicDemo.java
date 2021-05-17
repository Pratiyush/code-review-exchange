package de.code.review.exchange.equals;

import de.code.review.exchange.annotation.*;
import de.code.review.exchange.type.IssueType;
import de.code.review.exchange.type.SeverityType;
import de.code.review.exchange.type.TagType;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


@Todo("Improvement:  Try atomic values with null value.")
@Contributors(value = {@Contributor(name = "Pratiyush Kumar Singh", version = "0.1", note = "Created SecureRandomDemo Class")})
public class AtomicDemo {

    public static void main(final String[] args) {
        compareAtomicInteger();
        compareAtomicLong();
        compareAtomicBoolean();
    }

    @Issue(IssueType.BUG)
    @Severity(SeverityType.MAJOR)
    @Tag(TagType.MULTITHREADING)
    @Todo("Add Topic")
    @Source("SonarCube")
    @Reference("https://rules.sonarsource.com/java/RSPEC-2204")
    @Note(notes = {"<code>AtomicInteger</code>, and <code>AtomicLong<code> extend <code>Number</code>, but they're distinct from <code>Integer</code> and <code>Long</code> " +
            "and should be handled differently. <code>AtomicInteger</code> and <code>AtomicLong</code> are designed to support lock-free, thread-safe programming on " +
            "single variables. As such, an <code>AtomicInteger</code> will only ever be \"equal\" to itself. Instead, you should .get() the value and make comparisons on it.",
            "This applies to all the atomic, seeming-primitive wrapper classes: <code>AtomicInteger</code>, <code>AtomicLong</code>, and <code>AtomicBoolean</code>."})
    private static void compareAtomicInteger() {
        final AtomicInteger atomicIntegerOne = new AtomicInteger();
        final AtomicInteger atomicIntegerTwo = new AtomicInteger();

        if (atomicIntegerOne.equals(atomicIntegerTwo)) { // Non Compliant
            System.out.println("This is non compliant way of comparing.");
        }

        if (atomicIntegerOne.get() == atomicIntegerTwo.get()) { // Compliant
            System.out.println("This is compliant way of comparing.");
        }
    }


    @Issue(IssueType.BUG)
    @Severity(SeverityType.MAJOR)
    @Tag(TagType.MULTITHREADING)
    @Todo("Add Topic")
    @Source("SonarCube")
    @Reference("https://rules.sonarsource.com/java/RSPEC-2204")
    @See("de.code.review.exchange.security.AtomicDemo.compareAtomicInteger")
    private static void compareAtomicLong() {
        final AtomicLong atomicLongOne = new AtomicLong();
        final AtomicLong atomicLongTwo = new AtomicLong();

        if (atomicLongOne.equals(atomicLongTwo)) { // Non Compliant
            System.out.println("This is non compliant way of comparing.");
        }

        if (atomicLongOne.get() == atomicLongTwo.get()) { // Compliant
            System.out.println("This is compliant way of comparing.");
        }
    }


    @Issue(IssueType.BUG)
    @Severity(SeverityType.MAJOR)
    @Tag(TagType.MULTITHREADING)
    @Todo("Add Topic")
    @Source("SonarCube")
    @Reference("https://rules.sonarsource.com/java/RSPEC-2204")
    @See("de.code.review.exchange.security.AtomicDemo.compareAtomicInteger")
    private static void compareAtomicBoolean() {
        final AtomicBoolean atomicBooleanOne = new AtomicBoolean();
        final AtomicBoolean atomicBooleanTwo = new AtomicBoolean();

        if (atomicBooleanOne.equals(atomicBooleanTwo)) { // Non Compliant
            System.out.println("This is non compliant way of comparing.");
        }

        if (atomicBooleanOne.get() == atomicBooleanTwo.get()) { // Compliant
            System.out.println("This is compliant way of comparing.");
        }
    }
}
