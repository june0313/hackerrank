package hacker_rank.algorithm.string.caesar_cipher;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void encrypt() throws Exception {
        assertThat(CaesarCipher.encrypt("apple", 2), is("crrng"));
        assertThat(CaesarCipher.encrypt("apple", 3), is("dssoh"));
        assertThat(CaesarCipher.encrypt("z", 1), is("a"));
        assertThat(CaesarCipher.encrypt("Z", 1), is("A"));
        assertThat(CaesarCipher.encrypt("middle-Outz", 2), is("okffng-Qwvb"));
    }

}