package by.htp.bean;

import java.util.List;
import java.util.Random;

public class Divination {
	
	private final List<String> predictions;
	
	public Divination(List<String> predictions) {
		this.predictions = predictions;
	}

	public List<String> getPredictions() {
		return predictions;
	}
	
	public String getRandomPrediction() {
		return predictions.get(new Random().nextInt(predictions.size()));
	}
	
}
