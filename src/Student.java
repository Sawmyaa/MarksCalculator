import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton CALCULATEButton;
    private JPanel Main;
    private JTextField txtMarks4;
    private JTextField txtMarks5;
    private JLabel Percentage;
    private JTextField txtPercentage;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    CALCULATEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int m1, m2, m3, m4, m5, tot;
            double avg;
            double per;
            double div;
            double max = 500;

            m1 = Integer.parseInt(txtMarks1.getText());
            m2 = Integer.parseInt(txtMarks2.getText());
            m3 = Integer.parseInt(txtMarks3.getText());
            m4 = Integer.parseInt(txtMarks4.getText());
            m5 = Integer.parseInt(txtMarks5.getText());

            tot = m1+m2+m3+m4+m5;
            txtTotal.setText(String.valueOf(tot));

            avg = tot/5;
            txtAvg.setText(String.valueOf(avg));

            div = tot/max;
            per = div*100;
            txtPercentage.setText(String.valueOf(per));

            if(avg>50){
                txtGrade.setText("Pass");
            } else {
                txtGrade.setText("Fail");
            }

        }
    });
}
}
