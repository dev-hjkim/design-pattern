package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);


        System.out.println("\n===========================================================================\n");
        // --------------------------------------------------------------------------------
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();


        System.out.println("\n===========================================================================\n");
        // --------------------------------------------------------------------------------
        RemoteControlWithUndo remoteControlWithUndo2 = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo2.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControlWithUndo2.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControlWithUndo2.onButtonWasPushed(0);
        remoteControlWithUndo2.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo2);
        remoteControlWithUndo2.undoButtonWasPushed();

        remoteControlWithUndo2.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo2);
        remoteControlWithUndo2.undoButtonWasPushed();


        System.out.println("\n===========================================================================\n");
        // --------------------------------------------------------------------------------
        RemoteControlWithUndo remoteControlWithUndo3 = new RemoteControlWithUndo();

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD };
        Command[] partyOff = { livingRoomLightOff, stereoOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControlWithUndo3.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControlWithUndo3);
        System.out.println("--- 매크로 ON ---");
        remoteControlWithUndo3.onButtonWasPushed(0);
        System.out.println("--- 매크로 OFF ---");
        remoteControlWithUndo3.offButtonWasPushed(0);

    }
}
