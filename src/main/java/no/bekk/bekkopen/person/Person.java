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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private final static DateFormat fDatoFormat = new SimpleDateFormat("ddMMyy");

    private final Navn navn;

    private final Fodselsnummer fodselsnummer;

    public Person(Navn navn, Fodselsnummer fodselsnummer) {
        super();
        this.navn = navn;
        this.fodselsnummer = fodselsnummer;
    }

    public Navn getNavn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFornavn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMellomnavn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEtternavn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Fodselsnummer getFodselsnummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFodselsdatoAsString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getFodselsdato() throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPersonnummer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean erKvinne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean erMann() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
