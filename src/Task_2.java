
import org.json.*;

public class Task_2 {
    public static void jsonParser() {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        JSONArray jsonArray = new JSONArray(jsonString);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String surname = obj.getString("фамилия");
            String mark = obj.getString("оценка");
            String subject = obj.getString("предмет");
            result.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(subject).append(".\n");
        }
        System.out.println(result.toString());
    }
}
