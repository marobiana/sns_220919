package com.sns.comment.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.comment.dao.CommentDAO;
import com.sns.comment.model.Comment;
import com.sns.comment.model.CommentView;

@Service
public class CommentBO {
	@Autowired
	private CommentDAO commentDAO;
	
	public void createComment(int userId, int postId, String content) {
		commentDAO.insertComment(userId, postId, content);
	}
	
	public List<Comment> getCommentListByPostId(int postId) {
		return commentDAO.selectCommentListByPostId(postId);
	}
	
	// input: 글번호
	// output: 글번호에 해당하는 댓글목록(+댓글쓴이 정보)을 가져온다.
	public List<CommentView> generateCommentViewListByPostId(int postId) {
		// 결과물
		
		// 댓글 목록
		
		// 반복문 => CommentView => 결과물에 넣는다.
		
		// 결과물 리턴
	}
}













