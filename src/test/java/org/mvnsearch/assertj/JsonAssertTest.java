package org.mvnsearch.assertj;

import org.junit.Test;
import org.mvnsearch.assertj.json.JsonAssert;
import org.mvnsearch.assertj.json.JsonAssertions;

/**
 * json test
 *
 * @author linux_china
 */
public class JsonAssertTest {

    @Test
    public void testSpike() throws Exception {
        JsonAssert jsonAssert = JsonAssertions.assertThat(this.getClass().getResourceAsStream("/demo.json"));
        jsonAssert.exists("$.store.book[0]");
    }
}
