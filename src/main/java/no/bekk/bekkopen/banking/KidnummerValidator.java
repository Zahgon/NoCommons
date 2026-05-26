package no.bekk.bekkopen.banking;

/*-
 * #%L
 * NoCommons
 * %%
 * Copyright (C) 2014 - 2023 BEKK open source
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */
import no.bekk.bekkopen.common.StringNumber;
import no.bekk.bekkopen.common.StringNumberValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import static no.bekk.bekkopen.common.Checksums.ERROR_INVALID_CHECKSUM;
import static no.bekk.bekkopen.common.Checksums.calculateMod10CheckSum;
import static no.bekk.bekkopen.common.Checksums.calculateMod11CheckSumAllowDash;
import static no.bekk.bekkopen.common.Checksums.getMod10Weights;
import static no.bekk.bekkopen.common.Checksums.getMod11Weights;

public class KidnummerValidator extends StringNumberValidator implements ConstraintValidator<no.bekk.bekkopen.banking.annotation.Kidnummer, String> {

    public static final String ERROR_LENGTH = "A Kidnummer is between 3(+1) and 25 digits";

    private KidnummerValidator() {
        super();
    }

    /**
     * Return true if the provided String is a valid KID-nummmer.
     *
     * @param kidnummer A String containing a Kidnummer
     * @return true or false
     */
    public static boolean isValid(String kidnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an object that represents a Kidnummer.
     *
     * @param kidnummer A String containing a Kidnummer
     * @return A Kidnummer instance
     * @throws IllegalArgumentException thrown if String contains an invalid Kidnummer
     */
    public static Kidnummer getKidnummer(String kidnummer) throws IllegalArgumentException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void validateSyntax(String kidnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void validateLengthInRange(String kidnummer, int i, int j) {
        if (kidnummer == null || kidnummer.length() < i || kidnummer.length() > j) {
            throw new IllegalArgumentException(ERROR_LENGTH);
        }
    }

    public static void validateChecksum(String kidnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void initialize(no.bekk.bekkopen.banking.annotation.Kidnummer constraintAnnotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isValid(String kidnummer, ConstraintValidatorContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
