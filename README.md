AssertJ for Json
================

assertj for json with json-smart and json path 

### Usage

```java
import org.junit.Test;
import org.mvnsearch.assertj.json.JsonAssert;
import org.mvnsearch.assertj.json.JsonAssertions;

public class JsonAssertTest {

    @Test
    public void testSpike() throws Exception {
        JsonAssert jsonAssert = JsonAssertions.assertThat(this.getClass().getResourceAsStream("/demo.json"));
        jsonAssert.exists("$.store.book[0]");
    }
}
```

### reference

* assertj: http://joel-costigliola.github.io/assertj/index.html
* Json-smart: http://netplex.github.io/json-smart/
* Json Path: https://github.com/jayway/JsonPath