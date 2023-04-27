// Generated by view binder compiler. Do not edit!
package com.over3.listmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.over3.listmaker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopupAddListByIdLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonConfirmListID;

  @NonNull
  public final EditText editTextListID;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline20;

  @NonNull
  public final Guideline guideline21;

  @NonNull
  public final Guideline guideline22;

  @NonNull
  public final Guideline guideline23;

  @NonNull
  public final Guideline guideline24;

  @NonNull
  public final Guideline guideline25;

  private PopupAddListByIdLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonConfirmListID, @NonNull EditText editTextListID,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline20, @NonNull Guideline guideline21,
      @NonNull Guideline guideline22, @NonNull Guideline guideline23,
      @NonNull Guideline guideline24, @NonNull Guideline guideline25) {
    this.rootView = rootView;
    this.buttonConfirmListID = buttonConfirmListID;
    this.editTextListID = editTextListID;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline20 = guideline20;
    this.guideline21 = guideline21;
    this.guideline22 = guideline22;
    this.guideline23 = guideline23;
    this.guideline24 = guideline24;
    this.guideline25 = guideline25;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopupAddListByIdLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopupAddListByIdLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popup_add_list_by_id_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopupAddListByIdLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonConfirmListID;
      Button buttonConfirmListID = ViewBindings.findChildViewById(rootView, id);
      if (buttonConfirmListID == null) {
        break missingId;
      }

      id = R.id.editTextListID;
      EditText editTextListID = ViewBindings.findChildViewById(rootView, id);
      if (editTextListID == null) {
        break missingId;
      }

      id = R.id.guideline18;
      Guideline guideline18 = ViewBindings.findChildViewById(rootView, id);
      if (guideline18 == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = ViewBindings.findChildViewById(rootView, id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline20;
      Guideline guideline20 = ViewBindings.findChildViewById(rootView, id);
      if (guideline20 == null) {
        break missingId;
      }

      id = R.id.guideline21;
      Guideline guideline21 = ViewBindings.findChildViewById(rootView, id);
      if (guideline21 == null) {
        break missingId;
      }

      id = R.id.guideline22;
      Guideline guideline22 = ViewBindings.findChildViewById(rootView, id);
      if (guideline22 == null) {
        break missingId;
      }

      id = R.id.guideline23;
      Guideline guideline23 = ViewBindings.findChildViewById(rootView, id);
      if (guideline23 == null) {
        break missingId;
      }

      id = R.id.guideline24;
      Guideline guideline24 = ViewBindings.findChildViewById(rootView, id);
      if (guideline24 == null) {
        break missingId;
      }

      id = R.id.guideline25;
      Guideline guideline25 = ViewBindings.findChildViewById(rootView, id);
      if (guideline25 == null) {
        break missingId;
      }

      return new PopupAddListByIdLayoutBinding((ConstraintLayout) rootView, buttonConfirmListID,
          editTextListID, guideline18, guideline19, guideline20, guideline21, guideline22,
          guideline23, guideline24, guideline25);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}