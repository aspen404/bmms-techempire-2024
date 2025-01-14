/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       |
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor backLeftDrive;
    DcMotor backRightDrive;
    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor armTilt;
    DcMotor armExtend;
    DcMotor claw;
    BNO055IMU imu;

@Override
    public void runOpMode() {
      backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
      backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
      frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
      frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
      armTilt = hardwareMap.get(DcMotor.class, "armTilt");
      armExtend = hardwareMap.get(DcMotor.class, "armExtend");
      claw = hardwareMap.get(DcMotor.class, "claw");
      imu = hardwareMap.get(BNO055IMU.class, "imu");
      frontRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
      backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);

      // Put initialization blocks here
      
      
      
      claw.setPower(-1);
      sleep(100);
      Forward(1000, 1);
      armDown(500, 1);
      
      armTilt.setPower(0);
      sleep(200);
      claw.setPower(1);
      sleep(500);
      // -=-
      Backward(500, 1);
      Left(3000, 1);
      armDown(500, 1);
      Forward(150, 1);
      claw.setPower(-1);
      //-=-
      sleep(1000);
      armUp(1000, 1);
      turnLeft(2000, 1);
      armExtend.setPower(1);
      //-=-
      sleep(1000);
      armDown(275, 1);
      sleep(100);
      claw.setPower(1);
      //-=-
      armExtend.setPower(-1);
      //-=-
      //
      turnRight(2000, 1);
      Left(600, 1);
      Backward(50, 1);
      armDown(900, 1);
      claw.setPower(-1);
      sleep(1000);
      armUp(1000, 1);
      turnLeft(2250, 1);
      armExtend.setPower(1);
      
      sleep(1000);
      armDown(100, 1);
      claw.setPower(1);
      //-=-
      armExtend.setPower(-1);
      //-=-
      turnRight(2250, 1);
      Right(500, 1);
      //E 400
      //K 450
      //O 425
      Forward(1500, 1);
      turnLeft(1300, 1);
      Backward(350, 1);
      armDown(1000, 1);
      claw.setPower(-1);
      sleep(1500);
      armUp(1000, 1);
      Left(1000, 1);
      turnLeft(700, 1);
      armExtend.setPower(1);
      sleep(1000);
      Forward(250, 1);
      armDown(500, 1);
      claw.setPower(1);
      armUp(500, 1);
      turnLeft(1775, 1);
      Forward(5500, 1);
      
      
    //   turnRight(1700, 1);
    //   armDown(1000, 1);
    //   Backward(100, 1);
      
      
      
      
      
      
      //turnLeft(1500, 1);
      //armExtend.setPower(-1);
      //Forward(6000, 1);
      
      //20 seconds (somehow??? let this be proof im not going crazy)
      //Points: 21
      //Specimen on lower bar: 6pts
      //Sample in lower basket X2: 8pts
      //Parking in observation zone: 3pts
      //not bad
      
      
      
      
      
      /*
      
      NOTE: Normally would stop making the claw/arm extend go at the -=-
      to not overstress the servos, but the 
      laws of physics do not apply in ftcsim
      so we let it run 
      */
      
      
      
      
      
    }

    
    public void Forward(int time, int power) {
      frontLeftDrive.setPower(-power);
      backLeftDrive.setPower(-power);
      frontRightDrive.setPower(-power);
      backRightDrive.setPower(-power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void Backward(int time, int power) {
      frontLeftDrive.setPower(power);
      backLeftDrive.setPower(power);
      frontRightDrive.setPower(power);
      backRightDrive.setPower(power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void Left(int time, int power) {
      frontLeftDrive.setPower(power);
      backLeftDrive.setPower(-power);
      frontRightDrive.setPower(-power);
      backRightDrive.setPower(power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void Right(int time, int power) {
      frontLeftDrive.setPower(-power);
      backLeftDrive.setPower(power);
      frontRightDrive.setPower(power);
      backRightDrive.setPower(-power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void diagonalFL(int time, int power) {
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(-power);
      frontRightDrive.setPower(-power);
      backRightDrive.setPower(0);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void diagonalFR(int time, int power) {
      frontLeftDrive.setPower(-power);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(-power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void diagonalBL(int time, int power) {
      frontLeftDrive.setPower(power);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void diagonalBR(int time, int power) {
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(power);
      frontRightDrive.setPower(power);
      backRightDrive.setPower(0);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    
    public void turnLeft(int time, int power) {
      frontLeftDrive.setPower(power);
      backLeftDrive.setPower(power);
      frontRightDrive.setPower(-power);
      backRightDrive.setPower(-power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    public void turnRight(int time, int power) {
      frontLeftDrive.setPower(-power);
      backLeftDrive.setPower(-power);
      frontRightDrive.setPower(power);
      backRightDrive.setPower(power);
      sleep(time);
      frontLeftDrive.setPower(0);
      backLeftDrive.setPower(0);
      frontRightDrive.setPower(0);
      backRightDrive.setPower(0);
    }
    public void armUp(int time, int power) {
      armTilt.setPower(-power);
      sleep(time);
      armTilt.setPower(0);
    }
    public void armDown(int time, int power) {
      armTilt.setPower(power);
      sleep(time);
      armTilt.setPower(0);
    }
    
    public void armArm(int arm) {
       frontLeftDrive.setPower(-power);
       backLeftDrive.setPower(-power);
       frontRightDrive.setPower(power);
       backRightDrive.setPower(power); 
    }
}

