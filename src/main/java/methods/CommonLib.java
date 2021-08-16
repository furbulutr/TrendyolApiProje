package methods;


import com.fasterxml.jackson.databind.ObjectMapper;;

public class CommonLib
{
    public static <T> T getResponse(String response,Class<T> tClass){
        ObjectMapper mapper=new ObjectMapper();
        try {
            return mapper.readValue(response,tClass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
