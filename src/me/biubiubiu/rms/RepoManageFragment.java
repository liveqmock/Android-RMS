package me.biubiubiu.rms;

import android.util.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.app.*;
import android.os.*;
import android.database.*;
import android.net.*;
import android.opengl.*;
import android.graphics.*;
import android.view.animation.*;

import java.util.*;
import org.json.*;

import android.support.v4.app.Fragment;

public class RepoManageFragment extends BaseFragment {

    private BlockAdapter mAdapter;

    static public final String[][] TITLES = {
        {"产品入库", "Warehousing Managemengt"},
        {"产品出库", "Warehousing Managemengt"},
        {"产品出库入库查询", "Infomation notice"},
        {"产品信息查询", "Products Management"},
        {"供应商管理", "Supplier Management"},
        {"操作员信息管理", "Operator Management"},
        {"操作员信息管理", "Operator Management"},
    };

    public RepoManageFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        GridView grid = (GridView)inflater.inflate(
                R.layout.repo_manage_fragment, container, false);
        mAdapter = new BlockAdapter();
        grid.setAdapter(mAdapter);
        grid.setOnItemClickListener(mAdapter);

        return grid;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.imports, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    public class BlockAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {

        public int getCount() {
            return TITLES.length;
        }
    
        public Object getItem(int position) {
            return null;
        }
    
        public long getItemId(int position) {
            return position;
        }
    
        public View getView(int position, View convertView, ViewGroup parent) {
            return getBlock(TITLES[position][0], TITLES[position][1]);
        }

        private View getBlock(String major, String minor) {
            View item = LayoutInflater.from(
                    getActivity()).inflate(R.layout.row_item_repo_manage, null, false);
            ((TextView)item.findViewById(R.id.major)).setText(major);
            ((TextView)item.findViewById(R.id.minor)).setText(minor);
            return item;
        }

        @Override
        public void onItemClick(AdapterView parent, View view, int pos, long id) {
            if (pos == 0) {
                Intent intent = new Intent(getActivity(), ImportActivity.class);
                startActivity(intent);
            }
        }
    }
}