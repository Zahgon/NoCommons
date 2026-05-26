package no.bekk.bekkopen.person;

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

/**
 * This class represent a Norwegian social security number - a Fodselsnummer. A
 * Fodselsnummer consists of 11 digits, where the first 6 digits contains the
 * date of birth and the last 5 consists of an Individnummer (3 digits) and two
 * checksum digits.
 */
public class Fodselsnummer extends StringNumber {

    Fodselsnummer(String fodselsnummer) {
        super(fodselsnummer);
    }

    /**
     * Returns the first 4 digits of the Fodselsnummer that contains the date
     * (01-31) and month(01-12) of birth.
     *
     * @return A String containing the date and month of birth.
     */
    public String getDateAndMonth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the first 2 digits of the Fodselsnummer that contains the date
     * (01-31), stripped for eventual d-numbers.
     *
     * @return A String containing the date of birth
     */
    public String getDayInMonth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the digits 3 and 4 of the Fodselsnummer that contains the month
     * (01-12), stripped for eventual d-numbers.
     *
     * @return A String containing the date of birth
     */
    public String getMonth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the birthyear of the Fodselsnummer
     *
     * @return a String containg the year of birth represented by 2 (two) digits. Century is not included.
     */
    public String getYear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the birthyear of the Fodselsnummer
     *
     * @return A String containing the year of birth represented by 4 (four) digits. Century is included.
     * @deprecated For removal - After 1.1.2032 we cannot reliably conclude correct century anymore.
     * <a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     * replaced by {@link #getYear()}
     */
    @Deprecated
    public String getBirthYear() {
        return getCentury() + get2DigitBirthYear();
    }

    /**
     * @deprecated For removal - After 1.1.2032 we cannot reliably conclude correct century anymore.
     * 	<a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     */
    @Deprecated
    String getCentury() {
        String result = null;
        int individnummerInt = Integer.parseInt(getIndividnummer());
        int birthYear = Integer.parseInt(get2DigitBirthYear());
        if (isDNumber(this.getValue())) {
            if (individnummerInt >= 500 && individnummerInt <= 599) {
                result = "18";
            } else if (individnummerInt <= 199 && birthYear < 40) {
                result = "19";
            } else if ((individnummerInt <= 499 || (individnummerInt >= 600 && individnummerInt <= 999)) && birthYear >= 40) {
                result = "19";
            } else if (individnummerInt >= 200 && individnummerInt <= 999 && birthYear < 40) {
                result = "20";
            }
        } else {
            if (individnummerInt <= 499) {
                result = "19";
            } else if (individnummerInt >= 500 && birthYear < 40) {
                result = "20";
            } else if (individnummerInt >= 500 && individnummerInt <= 749 && birthYear >= 54) {
                result = "18";
            } else if (individnummerInt >= 900 && birthYear > 39) {
                result = "19";
            }
        }
        return result;
    }

    /**
     * Returns the two digits of the Fodselsnummer that contains the year birth
     * (00-99).
     *
     * @return A String containing the year of birth.
     */
    public String get2DigitBirthYear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the first 6 digits of the Fodselsnummer that contains the date
     * (01-31), month(01-12) and year(00-99) of birth.
     *
     * @return A String containing the date and month of birth.
     */
    public String getDateOfBirth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the last 5 digits of the Fodselsnummer, also referred to as the
     * Personnummer. The Personnummer consists of the Individnummer (3 digits)
     * and two checksum digits.
     *
     * @return A String containing the Personnummer.
     */
    public String getPersonnummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the first three digits of the Personnummer, also known as the
     * Individnummer.
     *
     * @return A String containing the Individnummer.
     */
    public String getIndividnummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the digit that decides the gender - the 9th in the Fodselsnummer.
     *
     * @deprecated For removal - Gender will stop working after 1.1.2032
     * 	<a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     * @return The digit.
     */
    @Deprecated
    public int getGenderDigit() {
        return getAt(8);
    }

    /**
     * Returns the first checksum digit - the 10th in the Fodselsnummer.
     *
     * @return The digit.
     */
    public int getChecksumDigit1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the second checksum digit - the 11th in the Fodselsnummer.
     *
     * @return The digit.
     */
    public int getChecksumDigit2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns true if the Fodselsnummer represents a man.
     *
     * @deprecated For removal - Gender will stop working after 1.1.2032
     * 	<a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     * @return true or false.
     */
    @Deprecated
    public boolean isMale() {
        return getGenderDigit() % 2 != 0;
    }

    /**
     * Returns true if the Fodselsnummer represents a woman.
     *
     * @deprecated For removal - Gender will stop working after 1.1.2032
     * 	<a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     * @return true or false.
     */
    @Deprecated
    public boolean isFemale() {
        return !isMale();
    }

    static String parseSyntheticNumber(String fodselsnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean isSynthetic(String fodselsnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean isDNumber(String fodselsnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static String parseDNumber(String fodselsnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int getFirstDigit(String fodselsnummer) {
        return Integer.parseInt(fodselsnummer.substring(0, 1));
    }

    private static int getThirdDigit(String fodselsnummer) {
        return Integer.parseInt(fodselsnummer.substring(2, 3));
    }

    /**
     * @deprecated For removal - Gender will stop working after 1.1.2032
     * 	<a href="https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/nytt-fodselsnummer-fra-2032/">Nytt fødselsnummer fra 2032</a>
     */
    @Deprecated
    public KJONN getKjonn() {
        if (isFemale()) {
            return KJONN.KVINNE;
        } else {
            return KJONN.MANN;
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
