// Generated by view binder compiler. Do not edit!
package com.over3.listmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
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

public final class PopupShowListIdLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonBackShowListID;

  @NonNull
  public final Button buttonShareListDeepLink;

  @NonNull
  public final Guideline guideline10;

  @NonNull
  public final Guideline guideline11;

  @NonNull
  public final Guideline guideline12;

  @NonNull
  public final Guideline guideline13;

  @NonNull
  public final Guideline guideline14;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final TextView textViewShowListID;

  private PopupShowListIdLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonBackShowListID, @NonNull Button buttonShareListDeepLink,
      @NonNull Guideline guideline10, @NonNull Guideline guideline11,
      @NonNull Guideline guideline12, @NonNull Guideline guideline13,
      @NonNull Guideline guideline14, @NonNull Guideline guideline15,
      @NonNull Guideline guideline16, @NonNull Guideline guideline17,
      @NonNull TextView textViewShowListID) {
    this.rootView = rootView;
    this.buttonBackShowListID = buttonBackShowListID;
    this.buttonShareListDeepLink = buttonShareListDeepLink;
    this.guideline10 = guideline10;
    this.guideline11 = guideline11;
    this.guideline12 = guideline12;
    this.guideline13 = guideline13;
    this.guideline14 = guideline14;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.textViewShowListID = textViewShowListID;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopupShowListIdLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopupShowListIdLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popup_show_list_id_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopupShowListIdLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBackShowListID;
      Button buttonBackShowListID = ViewBindings.findChildViewById(rootView, id);
      if (buttonBackShowListID == null) {
        break missingId;
      }

      id = R.id.buttonShareListDeepLink;
      Button buttonShareListDeepLink = ViewBindings.findChildViewById(rootView, id);
      if (buttonShareListDeepLink == null) {
        break missingId;
      }

      id = R.id.guideline10;
      Guideline guideline10 = ViewBindings.findChildViewById(rootView, id);
      if (guideline10 == null) {
        break missingId;
      }

      id = R.id.guideline11;
      Guideline guideline11 = ViewBindings.findChildViewById(rootView, id);
      if (guideline11 == null) {
        break missingId;
      }

      id = R.id.guideline12;
      Guideline guideline12 = ViewBindings.findChildViewById(rootView, id);
      if (guideline12 == null) {
        break missingId;
      }

      id = R.id.guideline13;
      Guideline guideline13 = ViewBindings.findChildViewById(rootView, id);
      if (guideline13 == null) {
        break missingId;
      }

      id = R.id.guideline14;
      Guideline guideline14 = ViewBindings.findChildViewById(rootView, id);
      if (guideline14 == null) {
        break missingId;
      }

      id = R.id.guideline15;
      Guideline guideline15 = ViewBindings.findChildViewById(rootView, id);
      if (guideline15 == null) {
        break missingId;
      }

      id = R.id.guideline16;
      Guideline guideline16 = ViewBindings.findChildViewById(rootView, id);
      if (guideline16 == null) {
        break missingId;
      }

      id = R.id.guideline17;
      Guideline guideline17 = ViewBindings.findChildViewById(rootView, id);
      if (guideline17 == null) {
        break missingId;
      }

      id = R.id.textViewShowListID;
      TextView textViewShowListID = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowListID == null) {
        break missingId;
      }

      return new PopupShowListIdLayoutBinding((ConstraintLayout) rootView, buttonBackShowListID,
          buttonShareListDeepLink, guideline10, guideline11, guideline12, guideline13, guideline14,
          guideline15, guideline16, guideline17, textViewShowListID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
