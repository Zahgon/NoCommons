package no.bekk.bekkopen.mail;

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
import static no.bekk.bekkopen.common.HelperFunctions.distinctByKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import no.bekk.bekkopen.common.StringNumberValidator;
import no.bekk.bekkopen.mail.model.Kommunenavn;
import no.bekk.bekkopen.mail.model.Kommunenummer;
import no.bekk.bekkopen.mail.model.PostInfo;
import no.bekk.bekkopen.mail.model.Postnummer;
import no.bekk.bekkopen.mail.model.PostnummerKategori;
import no.bekk.bekkopen.mail.model.Poststed;

/**
 * Validates:
 * - Postnummer
 * - Poststed
 * - Kommunenummer
 * - Kommunenavn
 *
 * Lookup:
 * - Postnummer
 * - Poststed
 * - Kommunenummer
 * - Kommunenavn
 * - Postnummer kategori
 */
public class MailValidator extends StringNumberValidator {

    private static final int POSTNUMMER_LENGTH = 4;

    private static final int KOMMUNENUMMER_LENGTH = 4;

    private static Map<Postnummer, PostInfo> postInfo = new HashMap<>();

    public static Postnummer getPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Kommunenummer getKommunenummer(String kommunenummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PostnummerKategori getPostnummerKategori(String postnummerKategori) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Setup
    public static void setPostInfo(Map<Postnummer, PostInfo> postInfo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Validation
    public static boolean isValidPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void validatePostnummerSyntax(String postnummer) {
        validateLengthAndAllDigits(postnummer, POSTNUMMER_LENGTH);
    }

    public static boolean isValidKommunenummer(String kommunenummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void validateKommunenummerSyntax(String kommunenummer) {
        validateLengthAndAllDigits(kommunenummer, KOMMUNENUMMER_LENGTH);
    }

    // Statistics
    public static int getAntallPoststed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int getAntallPostnummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int getAntallKommunenummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Lookup - Postnummer
    public static PostInfo getPostInfoForPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Poststed getPoststedForPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Kommunenavn getKommunenavnForPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Kommunenummer getKommunenummerForPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PostnummerKategori getPostnummerKategoriForPostnummer(String postnummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<Postnummer> getPostnummerForPoststed(String poststed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Lookup - Kommunenummer / Kommunenavn
    public static Optional<PostInfo> getPostInfoForKommunenummer(String kommunenummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Kommunenavn getKommunenavnForKommunenummer(String kommunenummer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Optional<PostInfo> getPostInfoForKommunenavn(String kommunenavn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Kommunenummer getKommunenummerForKommunenavn(String kommunenavn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
