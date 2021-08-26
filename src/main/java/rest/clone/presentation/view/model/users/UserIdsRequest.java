package rest.clone.presentation.view.model.users;

import rest.clone.domain.model.user.UserIds;
import rest.clone.presentation.view.validation.annotation.OnlyIdAndCommaAnnotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserIdsRequest {
    // TODO: 2021/08/26 調子にのって実装したアノテーションだが、うまく機能していないので修正する. 0-9とカンマのみ許容する様にしたい
    @OnlyIdAndCommaAnnotation
    String nonSplitRequestParams;

    public UserIdsRequest(String request) {
        this.nonSplitRequestParams = request;
    }

    public UserIds asUserIds() {
        // TODO: 2021/08/26 チャンレジ: 下記の実装をStreamAPIを利用した実装に書き換える
        List<String> stringList = Arrays.asList(nonSplitRequestParams.split(","));
        List<UserId> userIdList = new ArrayList<>();
        for (String e : stringList) {
            userIdList.add(new UserId(Integer.valueOf(e)));
        }
        return new UserIds(userIdList);
    }
}
