package com.atucity.ai.keras.layers;

import com.atucity.ai.keras.activations.Activation;
import com.atucity.ai.keras.activations.Activations;

public class Dense extends Layer {

    protected int units;

    protected Activation activation;

    public Dense(int units, String activation) {
        this.units = units;
        this.activation = Activations.get(activation);



    }
}
