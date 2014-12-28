package org.fmich;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

public class NpmDepInfPlugin implements ApplicationComponent {

    private static final String NPMDEFINF_COMPONENT_NAME = "NpmDepInfPlugin";
    private boolean enabled = true;

    private static final Logger LOG = Logger.getInstance(NpmDepInfPlugin.class);

    public NpmDepInfPlugin() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return NPMDEFINF_COMPONENT_NAME;
    }

    @NotNull
    private static NpmDepInfPlugin getInstance() {
        return (NpmDepInfPlugin) ApplicationManager.getApplication().getComponent(NPMDEFINF_COMPONENT_NAME);
    }

    private void turnOnPlugin() {
    }

    private void turnOffPlugin() {
    }

    public static boolean isEnabled() {
        return getInstance().enabled;
    }

    public static void setEnabled(boolean enabled) {
        if (!enabled) {
            getInstance().turnOffPlugin();
        }

        getInstance().enabled = enabled;

        if (enabled) {
            getInstance().turnOnPlugin();
        }
    }
}
