package com.example.testgl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

public class MyGLRenderer implements GLSurfaceView.Renderer {


	    @Override
		public void onSurfaceCreated(GL10 unused, EGLConfig config) {
	        // Set the background frame color
	        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
	    }

	    @Override
		public void onDrawFrame(GL10 unused) {
	        // Redraw background color
	        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	    }

	    @Override
		public void onSurfaceChanged(GL10 unused, int width, int height) {
	        GLES20.glViewport(0, 0, width, height);
	    }
	}