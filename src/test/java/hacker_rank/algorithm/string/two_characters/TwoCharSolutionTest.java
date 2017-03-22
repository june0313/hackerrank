package hacker_rank.algorithm.string.two_characters;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wayne on 2017. 3. 22..
 */
public class TwoCharSolutionTest {

    @Test
    public void getLength() throws Exception {
        assertThat(TwoCharSolution.getLength("beabeefeab"), is(5));
        assertThat(TwoCharSolution.getLength("abaacdabd"), is(4));
        assertThat(TwoCharSolution.getLength("ab"), is(2));
        assertThat(TwoCharSolution.getLength("aa"), is(0));
        assertThat(TwoCharSolution.getLength("a"), is(0));
        assertThat(TwoCharSolution.getLength("b"), is(0));
        assertThat(TwoCharSolution.getLength("uyetuppelecblwipdsqabzsvyfaezeqhpnalahnpkdbhzjglcuqfjnzpmbwprelbayyzovkhacgrglrdpmvaexkgertilnfooeazvulykxypsxicofnbyivkthovpjzhpohdhuebazlukfhaavfsssuupbyjqdxwwqlicbjirirspqhxomjdzswtsogugmbnslcalcfaxqmionsxdgpkotffycphsewyqvhqcwlufekxwoiudxjixchfqlavjwhaennkmfsdhigyeifnoskjbzgzggsmshdhzagpznkbahixqgrdnmlzogprctjggsujmqzqknvcuvdinesbwpirfasnvfjqceyrkknyvdritcfyowsgfrevzon"), is(0));

    }

}