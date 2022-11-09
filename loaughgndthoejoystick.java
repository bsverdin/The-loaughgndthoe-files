//loaughgndthoe code for joystick
package frc.robot.competitions;
import frc.robot.commands.AdjustingDrive;
import frc.robot.commands.PollingTurn;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Ronda extends SequentialCommandGroup {
  /**
   * See the documentation of this class in general for information.
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public Ronda(Drivetrain drivetrain) {
    double threshold = 1, aggressiveness = 0.2;
    addCommands(
        Joystick rondaStick = new Joystick(1); // Creates a joystick on port 1
        JoystickButton rondaButton1 = new JoystickButton(rondaStick, 1); // Creates a new rondaButton 1 on rondaStick
        rondaButton1.whenPressed(());//move arm somehow
        
    );
  }
}
  