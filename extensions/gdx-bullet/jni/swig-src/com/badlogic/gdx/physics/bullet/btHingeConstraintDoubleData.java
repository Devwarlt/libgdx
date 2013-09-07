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

public class btHingeConstraintDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btHingeConstraintDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btHingeConstraintDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btHingeConstraintDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btHingeConstraintDoubleData obj) {
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
				gdxBulletJNI.delete_btHingeConstraintDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getTypeConstraintData() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setRbAFrame(btTransformDoubleData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbAFrame() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setRbBFrame(btTransformDoubleData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbBFrame() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setUseReferenceFrameA(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_useReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseReferenceFrameA() {
    return gdxBulletJNI.btHingeConstraintDoubleData_useReferenceFrameA_get(swigCPtr, this);
  }

  public void setAngularOnly(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_angularOnly_set(swigCPtr, this, value);
  }

  public int getAngularOnly() {
    return gdxBulletJNI.btHingeConstraintDoubleData_angularOnly_get(swigCPtr, this);
  }

  public void setEnableAngularMotor(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_enableAngularMotor_set(swigCPtr, this, value);
  }

  public int getEnableAngularMotor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_enableAngularMotor_get(swigCPtr, this);
  }

  public void setMotorTargetVelocity(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_motorTargetVelocity_set(swigCPtr, this, value);
  }

  public float getMotorTargetVelocity() {
    return gdxBulletJNI.btHingeConstraintDoubleData_motorTargetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorImpulse(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_maxMotorImpulse_set(swigCPtr, this, value);
  }

  public float getMaxMotorImpulse() {
    return gdxBulletJNI.btHingeConstraintDoubleData_maxMotorImpulse_get(swigCPtr, this);
  }

  public void setLowerLimit(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_lowerLimit_set(swigCPtr, this, value);
  }

  public float getLowerLimit() {
    return gdxBulletJNI.btHingeConstraintDoubleData_lowerLimit_get(swigCPtr, this);
  }

  public void setUpperLimit(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_upperLimit_set(swigCPtr, this, value);
  }

  public float getUpperLimit() {
    return gdxBulletJNI.btHingeConstraintDoubleData_upperLimit_get(swigCPtr, this);
  }

  public void setLimitSoftness(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return gdxBulletJNI.btHingeConstraintDoubleData_limitSoftness_get(swigCPtr, this);
  }

  public void setBiasFactor(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_biasFactor_set(swigCPtr, this, value);
  }

  public float getBiasFactor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_biasFactor_get(swigCPtr, this);
  }

  public void setRelaxationFactor(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getRelaxationFactor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_relaxationFactor_get(swigCPtr, this);
  }

  public btHingeConstraintDoubleData() {
    this(gdxBulletJNI.new_btHingeConstraintDoubleData(), true);
  }

}
