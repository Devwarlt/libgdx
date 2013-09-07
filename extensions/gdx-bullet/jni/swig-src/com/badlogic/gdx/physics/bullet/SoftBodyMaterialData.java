/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyMaterialData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyMaterialData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected SoftBodyMaterialData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyMaterialData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(SoftBodyMaterialData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_SoftBodyMaterialData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLinearStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_linearStiffness_set(swigCPtr, this, value);
  }

  public float getLinearStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_linearStiffness_get(swigCPtr, this);
  }

  public void setAngularStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_angularStiffness_set(swigCPtr, this, value);
  }

  public float getAngularStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_angularStiffness_get(swigCPtr, this);
  }

  public void setVolumeStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_volumeStiffness_set(swigCPtr, this, value);
  }

  public float getVolumeStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_volumeStiffness_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    gdxBulletJNI.SoftBodyMaterialData_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return gdxBulletJNI.SoftBodyMaterialData_flags_get(swigCPtr, this);
  }

  public SoftBodyMaterialData() {
    this(gdxBulletJNI.new_SoftBodyMaterialData(), true);
  }

}
