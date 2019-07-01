package mira.mar.lightshow;


import java.lang.reflect.Field;
import java.util.List;

public class MirarmarLightshow {

    public List<String> getLights() {
        //should not compile
//        new MirrorLocationInMemoryStorage();

        try {
            Class<?> clazz = Class.forName("com.mirror.location.manager.MirrorLocationInMemoryStorage");
            Field field = clazz.getDeclaredField("locations");
            field.setAccessible(true);
            return (List<String>) field.get(clazz);
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
