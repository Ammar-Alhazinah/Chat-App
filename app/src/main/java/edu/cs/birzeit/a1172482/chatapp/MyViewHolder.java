package edu.cs.birzeit.a1172482.chatapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    CircleImageView profileImage;
    ImageView postImage, likeImage, commentsImage;
    TextView username, timeAgo,postDesc, likeCounter, commentsCounter;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        profileImage= itemView.findViewById(R.id.profileImagePost);
        postImage= itemView.findViewById(R.id.postImage);
        username= itemView.findViewById(R.id.profileUsernamePost);
        timeAgo= itemView.findViewById(R.id.timeAgo);
        postDesc= itemView.findViewById(R.id.postDesc);
        likeImage= itemView.findViewById(R.id.likeImage);
        commentsImage= itemView.findViewById(R.id.commentsImage);
        likeCounter= itemView.findViewById(R.id.likeCounter);
        commentsCounter= itemView.findViewById(R.id.commentCounter);

    }
}
