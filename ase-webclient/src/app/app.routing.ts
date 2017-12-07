/**
 * Created by Matthias on 30.11.17.
 */
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {FullLayoutComponent} from './containers/index';
import {RegisterComponent} from './register/register.component';
import {GroupsComponent} from './groups/groups.component';
import {AttendanceLogsComponent} from "./attendance-logs/attendance-logs.component";

export const routes: Routes = [
  // {path: '', component: HomeComponent}, //
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {
    path: '',
    redirectTo: 'dashboard',
    pathMatch: 'full',
  },
  {
    path: '',
    component: FullLayoutComponent,
    // canActivate: [AuthGuard],
    data: {
      title: 'Home'
    },
    children: [
      {
        path: 'dashboard',
        loadChildren: './views/dashboard/dashboard.module#DashboardModule'
      },
      {
        path: 'groups', component: GroupsComponent, data: {
          title: 'Groups'
        }
      },
      {
        path: 'group-logs/:groupId', component: AttendanceLogsComponent, data: {
          title: 'Logs'
        }
      },
      {
        // canActivate: [AuthGuard]
        path: 'logs/:userId', component: AttendanceLogsComponent, data: {
          title: 'Logs'
        }
      },
    ]

  },
  // otherwise redirect to home
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
