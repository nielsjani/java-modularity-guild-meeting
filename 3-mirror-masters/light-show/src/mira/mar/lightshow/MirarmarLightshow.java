package mira.mar.lightshow;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class MirarmarLightshow {

    public List<String> getLights() {
        //should not compile
//        new MirrorLocationInMemoryStorage();

        try {
            Class<?> clazz = Class.forName("com.mirror.location.manager.MirrorLocationInMemoryStorage");
            Field field = clazz.getDeclaredField("locations");
            field.setAccessible(true);
            return Arrays.asList((String[])field.get(clazz.getConstructor().newInstance()));
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
