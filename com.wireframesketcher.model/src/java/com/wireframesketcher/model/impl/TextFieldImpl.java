/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorBorderSupport;
import com.wireframesketcher.model.ColorDesc;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.StateSupport;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import com.wireframesketcher.model.TextField;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getState <em>State</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TextFieldImpl#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextFieldImpl extends WidgetImpl implements TextField {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.NORMAL;
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;
	/**
	 * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlignment TEXT_ALIGNMENT_EDEFAULT = TextAlignment.LEFT_LITERAL;
	/**
	 * The cached value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected TextAlignment textAlignment = TEXT_ALIGNMENT_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BACKGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "white");
	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc background = BACKGROUND_EDEFAULT;
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final int ALPHA_EDEFAULT = 255;
	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected int alpha = ALPHA_EDEFAULT;
	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BORDER_COLOR_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "black");
	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc borderColor = BORDER_COLOR_EDEFAULT;
	private static final WidgetDescriptor DESCRIPTOR = describe("Text Field", ResizeMode.HORIZONTAL_LITERAL);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TextFieldImpl() {
		super();
		setFont(ModelFactory.eINSTANCE.createFont());
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEXT_FIELD__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEXT_FIELD__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignment getTextAlignment() {
		return textAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignment(TextAlignment newTextAlignment) {
		TextAlignment oldTextAlignment = textAlignment;
		textAlignment = newTextAlignment == null ? TEXT_ALIGNMENT_EDEFAULT : newTextAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(ColorDesc newBackground) {
		ColorDesc oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(int newAlpha) {
		int oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(ColorDesc newBorderColor) {
		ColorDesc oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEXT_FIELD__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidState(State state) {
		return state == State.NORMAL || state == State.DISABLED || state == State.FOCUSED; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEXT_FIELD__FONT:
				return basicSetFont(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TEXT_FIELD__STATE:
				return getState();
			case ModelPackage.TEXT_FIELD__FONT:
				return getFont();
			case ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT:
				return getTextAlignment();
			case ModelPackage.TEXT_FIELD__BACKGROUND:
				return getBackground();
			case ModelPackage.TEXT_FIELD__ALPHA:
				return getAlpha();
			case ModelPackage.TEXT_FIELD__BORDER_COLOR:
				return getBorderColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TEXT_FIELD__STATE:
				setState((State)newValue);
				return;
			case ModelPackage.TEXT_FIELD__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT:
				setTextAlignment((TextAlignment)newValue);
				return;
			case ModelPackage.TEXT_FIELD__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.TEXT_FIELD__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.TEXT_FIELD__BORDER_COLOR:
				setBorderColor((ColorDesc)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.TEXT_FIELD__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ModelPackage.TEXT_FIELD__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.TEXT_FIELD__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.TEXT_FIELD__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.TEXT_FIELD__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.TEXT_FIELD__STATE:
				return state != STATE_EDEFAULT;
			case ModelPackage.TEXT_FIELD__FONT:
				return font != null;
			case ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case ModelPackage.TEXT_FIELD__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.TEXT_FIELD__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.TEXT_FIELD__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StateSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__STATE: return ModelPackage.STATE_SUPPORT__STATE;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT: return ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorBorderSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TEXT_FIELD__BORDER_COLOR: return ModelPackage.COLOR_BORDER_SUPPORT__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StateSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.STATE_SUPPORT__STATE: return ModelPackage.TEXT_FIELD__STATE;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.TEXT_FIELD__FONT;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT: return ModelPackage.TEXT_FIELD__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.TEXT_FIELD__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.TEXT_FIELD__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorBorderSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BORDER_SUPPORT__BORDER_COLOR: return ModelPackage.TEXT_FIELD__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", background: ");
		result.append(background);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(')');
		return result.toString();
	}

} //TextFieldImpl