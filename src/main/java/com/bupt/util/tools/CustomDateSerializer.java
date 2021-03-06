package com.bupt.util.tools;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 自定义返回JSON 数据格中日期格式化处理
 *
 * @author &lt;a href="http://www.micmiu.com"&gt;Michael Sun&lt;/a&gt;
 */
public class CustomDateSerializer extends JsonSerializer<Date> {
@Override
public void serialize(Date value, JsonGenerator jgen,
        SerializerProvider provider) throws IOException,
        JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String formattedDate = formatter.format(value);
        jgen.writeString(formattedDate);
        }

        }