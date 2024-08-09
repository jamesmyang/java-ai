package com.atucity.ai.keras.layers;

import com.atucity.ai.keras.ops.Operation;
import com.atucity.ai.keras.saving.KerasSaveable;

public class Layer extends Operation implements BackendLayer, KerasSaveable {

	protected boolean trainable;

	protected String name;

	public Layer() {
		super();
	}

	public Layer(boolean trainable, String name) {
		this.trainable = trainable;
		this.name = name;
	}

}
