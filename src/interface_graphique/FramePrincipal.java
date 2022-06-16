package interface_graphique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class FramePrincipal extends JFrame {
    private JPanel MainPanel;
    private JButton quitterButton;
    private JButton recopierButton;
    private JButton effacerButton;
    private JTextArea textEntrée;
    private JLabel textCopie;

    public FramePrincipal() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Copie d'un champ a un autre");
        setSize(700, 300);
        setVisible(true);

        initControle();
    }

    private void initControle() {
        setContentPane(MainPanel);
        quitterButton.addActionListener(new AppActionListener());
        recopierButton.addActionListener(new AppActionListener());
        effacerButton.addActionListener(new AppActionListener());
        textEntrée.setText("Veuillez entrer votre texte. ");
    }

    private void effacerText() {
        textEntrée.setText("");
        textCopie.setText("");
    }

    private void copierText() {
        textCopie.setForeground(Color.red);
        textCopie.setText(textEntrée.getText());
    }

    class AppActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == quitterButton) exit(0);
            if (e.getSource() == effacerButton) effacerText();
            if (e.getSource() == recopierButton) copierText();

        }
    }

}
