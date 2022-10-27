/*
package OtherTest;

*/
/**
 * @Author: Qihao
 * @Time: 2022/2022/10/27/12:16
 * @Descriptions:
 *//*



import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.demo.common.Person;


public class JsonLib {
    //json字符串-简单对象型
    private static final String  JSON_OBJ_STR = "{\"studentName\":\"lily\",\"studentAge\":12}";
    //json字符串-数组类型
    private static final String  JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
    //复杂格式json字符串
    private static final String  COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //demoJson();

        //testJSONStrToJSONObject();//json字符串转化对象
        //testJSONStrToJSONArray();//json数组转化json对象
        testComplexJSONStrToJSONObject();//json对象嵌套json对象
    }

    */
/**
     * 复杂json格式字符串与JSONObject之间的转换
     *//*

    public static void testComplexJSONStrToJSONObject(){
        System.out.println(COMPLEX_JSON_STR);
        JSONObject jsonObject = JSON.parseObject(COMPLEX_JSON_STR);
        //JSONObject jsonObject1 = JSONObject.parseObject(COMPLEX_JSON_STR);//因为JSONObject继承了JSON，所以这样也是可以的
        System.out.println(jsonObject);
        String teacherName = jsonObject.getString("teacherName");
        Integer teacherAge = jsonObject.getInteger("teacherAge");
        JSONObject course = jsonObject.getJSONObject("course");
        JSONArray students = jsonObject.getJSONArray("students");
        System.out.println(teacherName+"------"+teacherAge+"===json对象===="+course+"----json数组----"+students);
        JSONArray jsonArray = JSON.parseArray(students.toString());
        System.out.println(jsonArray.toString());
    }

    */
/**
     * json字符串-数组类型与JSONArray之间的转换
     *//*

    public static void testJSONStrToJSONArray(){

        JSONArray jsonArray = JSON.parseArray(JSON_ARRAY_STR);
        //JSONArray jsonArray1 = JSONArray.parseArray(JSON_ARRAY_STR);//因为JSONArray继承了JSON，所以这样也是可以的

        //遍历方式1
        int size = jsonArray.size();
        for (int i = 0; i < size; i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println(jsonObject.getString("studentName")+":"+jsonObject.getInteger("studentAge"));
        }

        //遍历方式2
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject.getString("studentName")+":"+jsonObject.getInteger("studentAge"));
        }
    }

    */
/**
     * json字符串-简单对象型与JSONObject之间的转换
     *//*

    public static void testJSONStrToJSONObject(){

        JSONObject jsonObject = JSON.parseObject(JSON_OBJ_STR);
        //JSONObject jsonObject1 = JSONObject.parseObject(JSON_OBJ_STR); //因为JSONObject继承了JSON，所以这样也是可以的

        System.out.println(jsonObject.getString("studentName")+":"+jsonObject.getInteger("studentAge"));

    }
    public static void demoJson() {
        */
/**
         * 将 Json 形式的字符串转换为 Map
         *//*

        String str = "{\"name\":\"Tom\",\"age\":90}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        Map<String, String> params = JSONObject.parseObject(jsonObject.toString(), new TypeReference<Map<String, String>>(){});
        System.out.println(params);

        */
/**
         * 将 Json 形式的字符串转换为 JavaBean
         *//*

        str = "{\"id\":\"A001\",\"name\":\"Jack\"}";
        jsonObject = JSONObject.parseObject(str);
        System.out.println(jsonObject);
        Person person = JSON.parseObject(str, new TypeReference<Person>() {});
        System.out.println(person.toString());
    }
}
*/
