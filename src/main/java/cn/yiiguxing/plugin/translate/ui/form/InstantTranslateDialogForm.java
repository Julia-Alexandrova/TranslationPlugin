package cn.yiiguxing.plugin.translate.ui.form;

import cn.yiiguxing.plugin.translate.ui.TTSButton;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.labels.LinkLabel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class InstantTranslateDialogForm extends DialogWrapper {
    private JPanel mRoot;
    protected ComboBox sourceLangComboBox;
    protected ComboBox targetLangComboBox;
    protected JButton swapButton;
    protected JButton translateButton;
    protected JTextArea inputTextArea;
    protected JTextArea translationTextArea;
    protected TTSButton inputTTSButton;
    protected TTSButton translationTTSButton;
    protected LinkLabel clearButton;
    protected LinkLabel copyButton;
    protected JScrollPane inputScrollPane;
    protected JScrollPane translationScrollPane;
    protected JPanel translationToolBar;
    protected JPanel inputToolBar;
    protected JPanel inputContentPanel;
    protected JPanel translationContentPanel;

    protected InstantTranslateDialogForm(@Nullable Project project) {
        super(project);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return mRoot;
    }
}
