import java.awt.Toolkit;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

import org.jfugue.player.Player;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.FingerList;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Listener;

public class SampleListener extends Listener {
	private RectPanel panel;
	private final double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	
	private Thread C;
	private Thread D;
	private Thread E;
	private Thread F;
	private Thread G;
	private Thread A;
	private Thread B;
	private Thread C7;
	
	
	public SampleListener(RectPanel panel){
		super();
		this.panel = panel;
	}
	
	public void onConnect(Controller controller){
		System.out.println("Connected");
		//controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);
	}
	
	public void onFrame(Controller controller){
		Frame frame = controller.frame();
		
		
		FingerList fingers = frame.fingers();
		
		//System.out.println(fingers.count());
		
		int x[] = new int[5];
		int y[] = new int[5];
		
		
		//for(int i = 0; i < frame.gestures().count(); i++){
		//	if(frame.gestures().get(i).type() == Gesture.Type.TYPE_KEY_TAP){
		//		player.play("C");
		//	}
		//}
		
		for(int i = 0; i < fingers.count(); i++){
			x[i] = (int) (width/2+(fingers.get(i).tipPosition().getX()*3));
			y[i] = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2+(fingers.get(i).tipPosition().getZ()*3));
		
			if(fingers.get(i).tipPosition().getY() < 100){
				//System.out.println(C.isAlive());
				if(x[i] <= (width * 1/8) && (C == null || !C.isAlive())){
					C = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(60, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					C.start();
				}else if(x[i] > (width * 1/8)&& x[i] <= (width * 1/4) &&(D == null || !D.isAlive())){
					D = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(62, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					D.start();
				}else if(x[i] > (width * 1/4)&& x[i] <= (width * 3/8) &&(E == null || !E.isAlive())){
					E = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(64, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					E.start();
				}else if(x[i] > (width * 3/8)&& x[i] <= (width * 1/2) &&(F == null || !F.isAlive())){
					F = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(65, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					F.start();
				}else if(x[i] > (width * 1/2)&& x[i] <= (width * 5/8) &&(G == null || !G.isAlive())){
					G = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(67, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					G.start();
				}else if(x[i] > (width * 5/8)&& x[i] <= (width * 3/4) &&(A == null || !A.isAlive())){
					A = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(69, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					A.start();
				}else if(x[i] > (width * 3/4)&& x[i] <= (width * 7/8) &&(B == null || !B.isAlive())){
					B = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(71, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(60);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					B.start();
				}else if(x[i] > (width * 7/8)&&(C7 == null || !C7.isAlive())){
					C7 = new Thread(){
						public void run(){
							Synthesizer midiSynth;
							try {
								midiSynth = MidiSystem.getSynthesizer();
								midiSynth.open();
								
								Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
						        MidiChannel[] mChannels = midiSynth.getChannels();
						        
						        midiSynth.loadInstrument(instr[0]);
						        
						        mChannels[0].noteOn(72, 100);
						        
						        try {
									Thread.sleep(150);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        
						        mChannels[0].noteOff(84);
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
							} 
						}
					};
					C7.start();
				}
			}
		}
		
		
		
		panel.setCoord(x, y);
		panel.repaint();
		
		//System.out.println(pos.getX() + " " + pos.getY() + " " + pos.getZ() + " - " + frame.gestures().count());
	}
}
