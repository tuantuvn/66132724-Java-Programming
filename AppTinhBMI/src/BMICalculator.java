import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMICalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ứng dụng tính chỉ số BMI");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel lblTitle = new JLabel("TÍNH CHỈ SỐ BMI");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(120, 20, 200, 30);
        frame.add(lblTitle);

        JLabel lblWeight = new JLabel("Cân nặng (kg):");
        lblWeight.setBounds(40, 80, 120, 30);
        frame.add(lblWeight);

        JTextField txtWeight = new JTextField();
        txtWeight.setBounds(180, 80, 150, 30);
        frame.add(txtWeight);

        JLabel lblHeight = new JLabel("Chiều cao (cm):");
        lblHeight.setBounds(40, 130, 120, 30);
        frame.add(lblHeight);

        JTextField txtHeight = new JTextField();
        txtHeight.setBounds(180, 130, 150, 30);
        frame.add(txtHeight);

        JButton btnCalculate = new JButton("Tính BMI");
        btnCalculate.setBounds(130, 180, 120, 35);
        frame.add(btnCalculate);

        JLabel lblResult = new JLabel("Chỉ số BMI của bạn: --");
        lblResult.setFont(new Font("Arial", Font.BOLD, 14));
        lblResult.setBounds(40, 230, 320, 30);
        frame.add(lblResult);

        JLabel lblConclusion = new JLabel("Phân loại: --");
        lblConclusion.setFont(new Font("Arial", Font.PLAIN, 14));
        lblConclusion.setBounds(40, 260, 320, 30);
        frame.add(lblConclusion);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(txtWeight.getText());
                    double heightCm = Double.parseDouble(txtHeight.getText());
                    
                    double heightM = heightCm / 100;
                    
                    double bmi = weight / (heightM * heightM);
                    
                    bmi = Math.round(bmi * 100.0) / 100.0;
                    
                    lblResult.setText("Chỉ số BMI của bạn: " + bmi);
                    
                    String conclusion = "";
                    if (bmi < 18.5) {
                        conclusion = "Gầy (Thiếu cân)";
                    } else if (bmi >= 18.5 && bmi < 24.9) {
                        conclusion = "Bình thường (Lý tưởng)";
                    } else if (bmi >= 25 && bmi < 29.9) {
                        conclusion = "Thừa cân";
                    } else {
                        conclusion = "Béo phì";
                    }
                    
                    lblConclusion.setText("Phân loại: " + conclusion);
                    
                } catch (NumberFormatException ex) {
                    lblResult.setText("Lỗi: Vui lòng nhập số hợp lệ!");
                    lblConclusion.setText("Phân loại: --");
                }
            }
        });

        frame.setVisible(true);
    }
}