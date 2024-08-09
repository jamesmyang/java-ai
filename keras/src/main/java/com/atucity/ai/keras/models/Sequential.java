package com.atucity.ai.keras.models;

import java.util.List;

import com.atucity.ai.keras.layers.Layer;

public class Sequential extends Model {

	protected Layer[] layers;

	public Sequential(Layer[] layers, boolean trainable, String name) {
		super(trainable, name);

	}
	
	public Sequential(List<Layer> layers, boolean trainable, String name) {
		super(trainable, name);

	}

	protected void add(Layer layer, boolean rebuild) {

	}

	protected boolean isLayerNameUnique(Layer layer) {
		return false;
	}

}
