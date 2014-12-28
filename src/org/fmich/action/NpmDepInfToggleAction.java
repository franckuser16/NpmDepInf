package org.fmich.action;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import org.fmich.NpmDepInfPlugin;

public class NpmDepInfToggleAction extends ToggleAction {
    @Override
    public boolean isSelected(AnActionEvent e) {
        return NpmDepInfPlugin.isEnabled();
    }

    @Override
    public void setSelected(AnActionEvent e, boolean state) {
        NpmDepInfPlugin.setEnabled(state);
    }
}
