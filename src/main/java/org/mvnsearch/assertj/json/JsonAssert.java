package org.mvnsearch.assertj.json;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import com.jayway.jsonpath.internal.JsonContext;
import net.minidev.json.JSONObject;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractObjectArrayAssert;
import org.assertj.core.api.AssertionsForClassTypes;

import java.util.Objects;


/**
 * json assert
 *
 * @author linux_china
 */
public class JsonAssert extends AbstractAssert<JsonAssert, JSONObject> {
    private ReadContext ctx;

    public JsonAssert(JSONObject actual) {
        super(actual, JsonAssert.class);
        JsonContext jsonContext = new JsonContext();
        this.ctx = jsonContext.parse(actual);
    }

    public <T> T read(String path, Class<T> clazz) {
        return ctx.read(path, clazz);
    }

    public JsonAssert exists(String path) {
        Object object = ctx.read(path);
        if (Objects.isNull(object)) {
            failWithMessage("Failed to find the value from '%s'", path);
        }
        return this;
    }

}
