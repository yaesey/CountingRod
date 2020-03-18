package CountingRod.core.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ModuleLoader {
    private List<Module> modules = new ArrayList<>();

    public void loadingModule() {
        int i = 1;
        while (i <= modules.size()) {
            if (modules.get(i).moduleID().equals("")) {
                throw new RuntimeException("Error : Can't find Module ID!");
            }
            ++i;
        }
    }

    public void addModule(Module module) {
        if (module != null) {
            modules.add(module);
        }else {
            throw new RuntimeException("Error : A module can't loading.");
        }
    }
}
