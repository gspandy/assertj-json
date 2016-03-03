package org.mvnsearch.assertj.json;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.InputStream;

/**
 * json assertions
 *
 * @author linux_china
 */
public class JsonAssertions {
    private static JSONParser parser = new JSONParser(JSONParser.MODE_PERMISSIVE);

    public static JsonAssert assertThat(JSONObject actual) {
        return new JsonAssert(actual);
    }

    public static JsonAssert assertThat(String jsonText) {
        try {
            return new JsonAssert((JSONObject) parser.parse(jsonText));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonAssert assertThat(InputStream in) {
        try {
            return new JsonAssert((JSONObject) parser.parse(in));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
